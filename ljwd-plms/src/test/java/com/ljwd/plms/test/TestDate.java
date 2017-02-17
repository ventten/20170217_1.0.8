package com.ljwd.plms.test;

import java.lang.reflect.Field;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import org.apache.activemq.filter.function.inListFunction;
import org.aspectj.weaver.NewConstructorTypeMunger;

import com.ljwd.plms.core.util.D;
import com.ljwd.plms.web.vo.outVisit.PlmsAppMapPointResult;
import com.ljwd.plms.web.vo.report.PlmsLaCollectorIncomeExportResult;



public class TestDate {

	public static void main(String[] args) {
		/*List<String> list = new ArrayList<String>();
		list.add("2");
		list.add("1");
		list.add("1");
		list.add("1");
		list.add("1");
		list.add("1");
		list.add("3");
		list.add("1");
		list.add("1");
		list.add("1");
		list.add("2");
		list.add("1");
		list.add("1");
		list.add("1");
		list.add("3");
		list.add("1");
		list.add("1");
		list.add("1");
		
		Map<Integer,List<String>>  ListMap = new HashMap<Integer,List<String>>();
		List<Integer> upperIndex = new ArrayList<Integer>();
		List<Integer> buttomIndex = new ArrayList<Integer>();

		//签到开始的点的个数
		if(list!= null &&list.size()>0){
			for(int i=0;i<list.size();i++){
				if(list.get(i).equals("2")){
					upperIndex.add(i);
				}else if(list.get(i).equals("3")){
					buttomIndex.add(i+1);
				}
		}	
		
		if(upperIndex!=null&&buttomIndex!=null){
			if(upperIndex.size()==buttomIndex.size()){
				for(int i=0;i<upperIndex.size();i++){
					//System.out.print(upperIndex.get(i)+",");	
					List<String> listSub = list.subList(upperIndex.get(i), buttomIndex.get(i));
					ListMap.put(i, listSub);
				}
			}else{
				System.out.println("起点和终点个数不匹配");
				
			}
			
		}
		
		
			
		
		*/
		
		
		
		/*if(list!= null &&list.size()>0){
			for(int i=0;i<lineCount;i++){
				Iterator<String> iter=list.iterator();
				List<String> lineList = new ArrayList<String>();
				while(iter.hasNext()){
					String result = iter.next();
					lineList.add(result);
					iter.remove();
					if(result.equals("2")){
						
					}
					if(result.equals("3")){
						ListMap.put(i, lineList);
						//lineList.clear();
						break;
					}
				
				}

			}
			
		}	
		*/
		/*if(!ListMap.isEmpty()){
			for(Integer key:ListMap.keySet()){
				System.out.println(key+":"+ListMap.get(key));
			}
			
		}
	}*/
	
		//System.out.println((null).compareTo(new Date())==0);
		
		/*List<String> strings = new ArrayList<String>();
		strings.add("aa");
		System.out.println(strings.contains("aa"));
		*/
		/*List<PlmsLaCollectorIncomeExportResult> laCollectorIncomeExportResults = new ArrayList<PlmsLaCollectorIncomeExportResult>();
		laCollectorIncomeExportResults.add(new PlmsLaCollectorIncomeExportResult());
		Iterator<PlmsLaCollectorIncomeExportResult> inListFunction = laCollectorIncomeExportResults.iterator();
		PlmsLaCollectorIncomeExportResult result = inListFunction.next();
		Field[] fds = result.getClass().getDeclaredFields();
		for(int i=0;i<fds.length;i++){
			System.out.println(fds[i].getName());
		}*/
		List<Long> list1 = new ArrayList<Long>();
		List<Long> list2 = new ArrayList<Long>();
		list1.add(1L);list1.add(2L);list1.add(3L);list1.add(5L);list1.add(6L);list1.add(20L);list1.add(3L);
		list2.add(1L);list2.add(2L);list2.add(3L);
		List<Long> list = getDiffrent(list1,list2);
		for(Long l:list){
			System.out.println(l);
		}
		
}
	private static List<Long> getDiffrent(List<Long> list1, List<Long> list2) {
        List<Long> diff = new ArrayList<Long>();
        List<Long> maxList = list1;
        List<Long> minList = list2;
        if(list2.size()>list1.size())
        {
            maxList = list2;
            minList = list1;
        }
        Map<Long,Integer> map = new HashMap<Long,Integer>(maxList.size());
        for (Long l : maxList) {
            map.put(l, 1);
        }
        for (Long l2 : minList) {
            if(map.get(l2)!=null)
            {
                map.put(l2, 2);
                continue;
            }
            diff.add(l2);
        }
        for(Map.Entry<Long, Integer> entry:map.entrySet())
        {
            if(entry.getValue()==1)
            {
                diff.add(entry.getKey());
            }
        }

        return diff;
   }
}
