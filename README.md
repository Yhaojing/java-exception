# java-exception
springmvc对于异常处理，实现异常处理接口RuntimeException 自定义自己的异常处理器
## 异常处理
 try-catch 以及 try-catch-finally

 try{
 //一些会抛出异常的方法,终止执行,若抛出多种类型的异常,由多个Catch块捕捉异常
 } catch(Exception e) {
 //处理异常的代码
 }

 多个Catch块顺序问题:
 先子后父,先小后大,若顺序错了,编译会不通过

 抛出异常throw (将异常抛出的动作)/ throws
 若调用的方法体内有throw必须使用try /catch捕捉异常,或者在外部使用throws 抛出异常(此时调用者不能处理异常,将异常抛到上一层)

  自定义异常
  必须继承java异常类库
