package com.ljwd.plms.web.filter;

import org.springframework.util.StringUtils;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.*;

/**
 * Created by zhengzw on 2017/2/15
 * 去除前后空格过滤器
 */
public class TrimFilter extends OncePerRequestFilter {

    /**
     * 去除前后空格
     * @param request request
     * @param response response
     * @param filterChain filterChain
     * @throws ServletException ServletException
     * @throws IOException IOException
     */
    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        filterChain.doFilter(new TrimFilterRequest(request),response);
    }

    private class TrimFilterRequest extends HttpServletRequestWrapper {
        private TrimFilterRequest(HttpServletRequest request) {
            super(request);
        }

        @Override
        public String getParameter(String name) {
            return trimParam(super.getParameter(name));
        }

        @Override
        public String[] getParameterValues(String name) {
            String[] values = super.getParameterValues(name);
            if (values == null) {
                return null;
            }
            for (int i = 0; i < values.length; i++) {
                values[i] = trimParam(values[i]);
            }
            return values;
        }

        @Override
        public Map getParameterMap() {
            Map keys = super.getParameterMap();
            Set set = keys.entrySet();
            Iterator iterator = set.iterator();
            while (iterator.hasNext()) {
                Object key = iterator.next();
                Object value = keys.get(key);
                keys.put(key, trimParams((String[]) value));
            }
            return keys;
        }

    }

    /**
     * 去除前后空格
     * @param param 参数值
     * @return 参数值
     */
    private String trimParam(String param){
        return param == null ? param : param.trim();
    }

    /**
     * 遍历参数数组里面的数据,去除前后空格
     * @param params 参数值数组
     * @return 参数值数组
     */
    private String[] trimParams(String[] params){
        for(int i = 0; i < params.length; i++){
            if(StringUtils.isEmpty(params[i])) continue;
            params[i]=params[i].trim();
        }
        return params;
    }

}
