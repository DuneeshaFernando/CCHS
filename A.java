import java.util.Date;
class A{
	public static void main(String args[]){
		try{
			System.out.println(10/0);
		}catch(Exception e){
			System.out.println("sorry");
		}
		System.out.println("Hello");
		Date d=new Date();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        String today=sdf.format(d); 
		System.out.println(today);
	}

}