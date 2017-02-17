 var md=new Date(); //第二个输入框最大值的全局变量  
        //第一个输入框选择好日期的时候操作  
  function pickedFunc(ele){  
        var Y=$dp.cal.getP('y'); //用内置方法获取到选中的年月日  
        var M=$dp.cal.getP('M');  
        var D=$dp.cal.getP('d');  
        M=parseInt(M,10)-1;  
        D=parseInt(D,10)+30;//字符串的数字转换成int再运算。并且如果超过30天，也能自动处理。  
        var d = new Date()  
        d.setFullYear(Y,M,D) //设置时间  
        var nowDate=new Date(); 
        if(nowDate<=d){ //现在的时间比较，如果算出来的值大于现在时间，修改全局变量md为现在时间。  
            md=nowDate;  
        }else{ //全局变量设置为算出来的值得   
             var month=d.getMonth()+1; //月份的范围是（0到11）;  
            md=d.getFullYear()+"-"+month+"-"+d.getDate(); //直接把d给过去会有问题，所以拼成字符串发过去  
        }  
    }  
  
  function pickedFunc_02(ele){  
      var Y=$dp.cal.getP('y'); //用内置方法获取到选中的年月日  
      var M=$dp.cal.getP('M');  
      var D=$dp.cal.getP('d');  
      M=parseInt(M,10)-1;  
      D=parseInt(D,10)+30;//字符串的数字转换成int再运算。并且如果超过30天，也能自动处理。  
      var d = new Date()  
      d.setFullYear(Y,M,D) //设置时间  
      var nowDate=new Date(); 
      var month=d.getMonth()+1; //月份的范围是（0到11）;  
      md=d.getFullYear()+"-"+month+"-"+d.getDate(); //直接把d给过去会有问题，所以拼成字符串发过去  
        
  }  
     //第一个清空的时候的操作  
     function clearedFunc(){  
        md=new Date();  
     }  
     //给第二个输入框定义规则  
     function picker2rule(ele,obj){  
    	var id = obj.id;
        WdatePicker({el:ele,minDate:"#F{$dp.$D(\'"+id+"\')}",maxDate:md});  
     }  
 