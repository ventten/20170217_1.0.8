/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ljwd.plms.web.model.messageSystem;

import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author czxu
 */
public class UserSearchResultDto {

    private List<UserSearchResultItemDto> records = new ArrayList<UserSearchResultItemDto>();
    
    public List<UserSearchResultItemDto> getRecords() {
        return records;
    }
    
    public void setRecords(List<?> records) {
       this.records = (List<UserSearchResultItemDto>) records;
    }
    
}
