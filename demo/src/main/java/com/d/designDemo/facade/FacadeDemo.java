package com.d.designDemo.facade;

import org.springframework.expression.spel.CodeFlow;

/**
 * Created by wang on 2017/7/31.
 */
public class FacadeDemo {

    class  Light{

        public void lightOn(){
            System.out.println("灯亮了~~~~~~");
        }

        public void lightOff(){
            System.out.println("灯关了~~~~~~");
        }

    }


    class Tv{

        public void tvOn(){
            System.out.println("电视开了~~~~~~");
        }

        public void tvOff(){
            System.out.println("电视关了~~~~~~~");
        }
    }

    class Fanner{

        public void fannerOn(){
            System.out.println("电风扇开了~~~~~");
        }
        public void fannerOff(){

            System.out.println("电风扇关了~~~~~");

        }
    }

    private Light light ;
    private Tv tv ;
    private Fanner fanner ;

    public FacadeDemo() {
        this.fanner = new Fanner() ;
        this.light = new Light() ;
        this.tv = new Tv() ;
    }

    public void allOn(){
      this.fanner.fannerOn();
      this.tv.tvOn();
      this.light.lightOn();
   }

   public void allOff(){
        this.fanner.fannerOff();
        this.tv.tvOff();
        this.light.lightOff();
   }



}
