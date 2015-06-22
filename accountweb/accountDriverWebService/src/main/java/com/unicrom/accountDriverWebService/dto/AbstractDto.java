/**
 * 
 */
package com.unicrom.accountDriverWebService.dto;

import java.util.Date;

/**
 * @author Georman
 *
 */
public class AbstractDto {
	
    protected Long id;
    protected String createdBy;
    protected Date createdDate;
   
    /**
     * @return the id
     */
    public Long getId() {
                return id;
    }
    /**
     * @param id the id to set
     */
    public void setId(Long id) {
                this.id = id;
    }
    /**
     * @return the createdBy
     */
    public String getCreatedBy() {
                return createdBy;
    }
    /**
     * @param createdBy the createdBy to set
     */
    public void setCreatedBy(String createdBy) {
                this.createdBy = createdBy;
    }
    /**
     * @return the createdDate
     */
    public Date getCreatedDate() {
                return createdDate;
    }
    /**
     * @param createdDate the createdDate to set
     */
    public void setCreatedDate(Date createdDate) {
                this.createdDate = createdDate;
    }

}
