package arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CreateArrayList {

	public static void main(String[] args) {
		List<String> arr = new ArrayList<String>();
		arr.add("Blue");
		arr.add("Red");
		arr.add("Black");
		arr.add("Violet");
		arr.add(0, "Yellow");
		
		
		/*String s = arr.get(2);
		//System.out.println(s);
		
		for (String ele : arr) {
			System.out.println(ele);
		}
		System.out.println("-------------------------");
		arr.set(2, "White");
		for (String ele : arr) {
			System.out.println(ele);
		}*/
		
		/*arr.remove(2);
		for (String ele : arr) {
			System.out.println(ele);
		}*/
		
		/*if(arr.contains("Red"))
		{
			System.out.println("Item found");
		}
		else {
			System.out.println("Not Found");
		}*/
		
		/*System.out.println("List before sort" +arr);
		Collections.sort(arr);
		System.out.println("After sort" + arr);
		*/
		System.out.println(arr);
		List<String> arr2 = new ArrayList<String>();
		arr2.add("A");
		arr2.add("B");
		arr2.add("C");
		System.out.println(arr2);
		System.out.println("==================");
		//Collections.copy(arr, arr2);
		//Collections.shuffle(arr2);
		//Collections.reverse(arr2);
		//System.out.println(arr);
		//List<String> sublist = arr2.subList(0, 2);
		//System.out.println(sublist);
		/*boolean abc = arr.contains("Blue");
		System.out.println(abc);*/
		//Collections.swap(arr2, 0, 2);
		ArrayList<String> a = new ArrayList<String>();
		a.addAll(arr);
		a.addAll(arr2);
		//System.out.println(a);
		ArrayList<String> clone = (ArrayList<String>)a.clone();
		//System.out.println(clone);
		//System.out.println(clone.isEmpty());
		//System.out.println(arr2);
		 int a1=arr.size();
		for(int i =0;i<a1;i++)
		{
			System.out.print(arr.get(i)+" ");
		}
		System.out.println("=====================");
		for(String demo: arr)
		{
			System.out.println(demo);
		}
		
		
		
	}
}
