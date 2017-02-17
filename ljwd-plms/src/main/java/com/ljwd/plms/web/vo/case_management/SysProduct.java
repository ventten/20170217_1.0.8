package com.ljwd.plms.web.vo.case_management;

import java.io.Serializable;

public class SysProduct implements Serializable{

	 	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

		private Long id;
	   
	    private String productNo;
	   
	    private String productName;
	    
	    private String productDescription;

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getProductNo() {
			return productNo;
		}

		public void setProductNo(String productNo) {
			this.productNo = productNo;
		}

		public String getProductName() {
			return productName;
		}

		public void setProductName(String productName) {
			this.productName = productName;
		}

		public String getProductDescription() {
			return productDescription;
		}

		public void setProductDescription(String productDescription) {
			this.productDescription = productDescription;
		}

		
		public SysProduct() {
			super();
		}

		public SysProduct(Long id, String productNo, String productName,
				String productDescription) {
			super();
			this.id = id;
			this.productNo = productNo;
			this.productName = productName;
			this.productDescription = productDescription;
		}
	  	    

	    
}
