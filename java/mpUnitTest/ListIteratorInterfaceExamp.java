package mpUnitTest;

import java.util.*;

import mpBean.UserBean;

public class ListIteratorInterfaceExamp {
	
	public static void main(String args[]){
		List<UserBean> mList = new ArrayList<UserBean>();
		mList.add(new UserBean("admin", "admin"));
		mList.add(new UserBean("admin1", "admin1"));
		mList.add(new UserBean("admin1", "admin1"));
		mList.add(new UserBean("trunglv", "123456"));
		//use arraylist
		Iterator itr = mList.iterator();
		while(itr.hasNext()){
			UserBean user = (UserBean)itr.next();
			System.out.println("User: " + user.getUsername() + " Pass: " + user.getPassword());
		}
		//use hashset filter dupplicate of element
		HashSet<UserBean> mSet = new HashSet<UserBean>(mList);
		Iterator itr1 = mSet.iterator();
		for(UserBean obj:mSet){
			System.out.println("User: " + obj.getUsername() + " Pass: " + obj.getPassword());
		}
	}
	
}
