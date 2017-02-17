package com.ljwd.plms.core.util;

import java.util.ArrayList;
import java.util.List;

import com.ljwd.plms.web.model.sys_management.SysOrg;

/**
 * <p>Title: InitOrgToTreeList</p>
 * @author pangshanxing
 * @date 2016年8月29日下午4:42:32
 */
public class InitOrgToTreeList {

	/**
	 * 
	* @Description: 所属机构树形排序
	* @param treeList
	* @param sourceList
	* @param parentId
	* @param spacelength
	* @return void
	 */
	 public  static void InitOrganizationDropDown(List<SysOrg> treeList, List<SysOrg> sourceList, long parentId, int spacelength)
     {
         

         List<SysOrg> list = GetOrganizationByParentId(sourceList, parentId);
         for (SysOrg org: list)
         {
        	 org.setOrgName(Space(spacelength)+org.getOrgName());
             treeList.add(org);
             InitOrganizationDropDown(treeList, sourceList, org.getId(), spacelength + 1);
         }
     }
	 
	  private  static List<SysOrg> GetOrganizationByParentId(List<SysOrg> sourceList, long parentId)
      {
          List<SysOrg> targetList = new ArrayList<SysOrg>();

          for (SysOrg org: sourceList)
          {
              if (org.getPid() == parentId)
              {
                  targetList.add(org);
              }
          }

          return targetList;
      }
	  
	  private  static String Space(int i)
      {
          String space = "";
          for (int j = 0; j < i; j++)
          {
              space += "　　";
          }
          return space;
      }
}
