package Maven.EpamTask;


public class NyG extends S implements C{

	public int wc(int nc,int weight) {
		return(nc*weight);
	
	}

	public static void main(String[] args) {
	
		int[] acw=new int[3];
		int tw;
		
		
		S kl=new S();
		C hs=new NyG();
		acw[0]=hs.wc(20,9);
		tw=acw[0]+kl.sw(20,90);
		
		System.out.println("WEIGHT OF G_1:"+tw);
		
		S bs=new S();
		C mn=new NyG();
		acw[1]=mn.wc(10,5);
		tw=acw[1]+bs.sw(20,90);
		
        System.out.println("WEIGHT OF G_2:"+tw);
        
        S lu=new S();
		C dm=new NyG();
		acw[2]=dm.wc(20,9);
		tw=acw[2]+lu.sw(20,9);
		
		 System.out.println("WEIGHT OF G_3:"+tw);
		
        
        for(int i=0;i<acw.length;i++)
        {
        	for(int j=i+1;j<acw.length;j++)
        	{
        		if(acw[i]>acw[j])
        		{
        			int temporary_variable=acw[i];
        			acw[i]=acw[j];
        			acw[j]=temporary_variable;
        		}
        	}
        }
        System.out.println("ASCENDING ORDER OF CHOCLATES");
        for(int i=0;i<acw.length;i++)
        {
        	System.out.print(acw[i]+" ");
        }
        System.out.println();
        		
	}

}

