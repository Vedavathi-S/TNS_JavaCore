class parse{
    public static void main(String[] args){
        System.out.println("Hello world");
        if(args.length<2)
        {
        	System.out.print("length is "+args.length);
        	return;
        	
        }
        try {
//        	int c=Integer.parseInt(args[0])+Integer.parseInt(args[1]);
//            System.out.print(c);
        	int sum=0;
        	for(String arg:args)
        	{
        		sum+=Integer.parseInt(arg);
        	}
        	System.out.print(sum);
        }
        catch(NumberFormatException e)
        {
        	System.out.print("number is not valid"+e);
        }
    }
}