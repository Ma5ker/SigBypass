package fun.sec4.bypassUtil;
import android.util.Log;

import fun.sec4.bypassUtil.HookPm;




public class hookUtil {

    //尝试对PM进行hook ，具体实现位于HookPm类中
    public static void hook(){
        try{
            HookPm.play();
        } catch (Exception e){
            Log.e("hookUtil","Play hook error!");
            e.printStackTrace();
        }
    }

}
