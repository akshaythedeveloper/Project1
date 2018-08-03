class Circle{
		public static void main(String args[]){
		System.out.println("enter the radius and work");
		double r=Integer.parseInt(args[0]),d,ar,cr;
		String s=args[1];
		switch(s){
		case "diameter": 	  
			d=r*2;
			System.out.println(d);
			break;
		case "area":
			ar=3.14*r*r;
			System.out.println(ar);
			break;
		case "circumference":
			cr=2*3.14*r;
			System.out.println(cr);
			break;
		default:
			System.out.println("nope");
			break;
		}
		}
		}