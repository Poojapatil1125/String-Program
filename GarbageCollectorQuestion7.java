package com.yash;
//7.WAP to demonstrate how garbage collector work when
//any memory is not referenced by string object.
public class GarbageCollectorQuestion7 {

		   String st;
		   public GarbageCollectorQuestion7(String st) {
		        super();
		        this.st = st;
		    }
		   @Override
		    protected void finalize() throws Throwable {
		        super.finalize();
		        System.out.println("Garbage collected");
		    }
		   public static void main(String[] args) {
			   GarbageCollectorQuestion7 gc = new GarbageCollectorQuestion7("yash");
		        gc = null;
		        System.gc();
		   }
}
