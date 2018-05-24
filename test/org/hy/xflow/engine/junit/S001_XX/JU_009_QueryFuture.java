package org.hy.xflow.engine.junit.S001_XX;

import org.hy.common.Help;
import org.hy.xflow.engine.XFlowEngine;
import org.hy.xflow.engine.bean.User;
import org.hy.xflow.engine.common.BaseJunit;
import org.junit.Test;





/**
 * 测试单元：获取用户可以处理（或叫待办）的工作流实例对应的第三方使用系统的业务数据ID。
 *
 * @author      ZhengWei(HY)
 * @createDate  2018-05-15
 * @version     v1.0
 */
public class JU_009_QueryFuture extends BaseJunit
{
    
    @Test
    public void test_001()
    {
        User v_User  = new User();
        v_User.setUserID("8a81b2b54b7b391b014b7d143a7400fe");
        v_User.setUserName("公用选型负责人");
        v_User.addRole("002" ,"选型负责人");
        
        XFlowEngine v_XFlowEngine = XFlowEngine.getInstance();
        
        for (int i=1; i<=10; i++)
        {
            long v_BeginTime = System.nanoTime();
            
            Help.print(v_XFlowEngine.queryServiceDataIDs(v_User));

            long v_EndTime = System.nanoTime();
            
            System.out.println("待办查询用时(纳秒)1秒(s)=1000000000纳秒(ns)：" + (v_EndTime - v_BeginTime));
        }
    }
    
}