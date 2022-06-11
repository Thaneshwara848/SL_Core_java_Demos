	//List al=new List(); bcz its interface  
		ArrayList al=new ArrayList();
		al.add("ABCD");
		al.add(200);
		al.add(500);
		al.add(700);
		al.add(true);
		al.add('A');
		al.add(10.77);
		al.add(new Date());
		al.add(new Thread());
		al.add(new Clerk());
		
		System.out.println(al);
//		for(int i=0;i<al.size();i++)
//		{
//			System.out.println(al.get(i));
//		}
//		
		Iterator i =al.iterator();
		
		while(i.hasNext()) {
			System.out.println(i.next());
		}