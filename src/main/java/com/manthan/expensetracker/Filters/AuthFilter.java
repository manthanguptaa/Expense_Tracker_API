package com.manthan.expensetracker.Filters;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.manthan.expensetracker.Constants;

import org.springframework.http.HttpStatus;
import org.springframework.web.filter.GenericFilterBean;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;

public class AuthFilter extends GenericFilterBean{

    @Override
    public void doFilter(ServletRequest arg0, ServletResponse arg1, FilterChain arg2)
            throws IOException, ServletException {
        HttpServletRequest httpRequest = (HttpServletRequest) arg0;
        HttpServletResponse httpResponse = (HttpServletResponse) arg1;
         
        String authHeader = httpRequest.getHeader("Authorization");
        if(authHeader!=null){
            String[] authHeaderArr = authHeader.split("Bearer");
            if(authHeaderArr.length >1 && authHeaderArr[1]!=null){
                String token = authHeaderArr[1];
                try{
                    Claims claims = Jwts.parser().setSigningKey(Constants.API_SECRET_KEY)
                        .parseClaimsJws(token).getBody();
                    httpRequest.setAttribute("userId",Integer.parseInt(claims.get("userId").toString()));

                }catch(Exception e){
                    httpResponse.sendError(HttpStatus.FORBIDDEN.value(), "Invalid/Expired Token");
                    return;
                }
            }
            else{
                httpResponse.sendError(HttpStatus.FORBIDDEN.value(), "Authorization token must be Bearer [token]");
                return;
            }
        }
        else{
            httpResponse.sendError(HttpStatus.FORBIDDEN.value(), "Authorization token must be provided");
            return;
        }
        arg2.doFilter(arg0,arg1);
    }
    
}
