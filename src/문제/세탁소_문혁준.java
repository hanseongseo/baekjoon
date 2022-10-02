package 문제;

import java.util.Scanner;

public class 세탁소_문혁준 {
	public static void main(String[] args) {
		// 나만의 키오스크
        Scanner sc = new Scanner(System.in);
		
		boolean run = true;
		int price = 0;
		
	while(run) {	
		System.out.println();
		System.out.println("24시 셀프세탁소에 오신 것을 환영합니다.");
		System.out.println("======================================");
		System.out.println("1.세탁 2.헹굼 3.탈수 4.건조 5.신발세탁 6.계산");
		System.out.println("======================================");		
		System.out.println("메뉴를 선택해주세요.");
		int menu = sc.nextInt();
		
		
		switch(menu) {
		case 1: 
			System.out.println("세탁");
			if(menu==1) {
				System.out.println("세탁 종류를 선택해주세요.");
				System.out.println("1.일반세탁 2.고급세탁");
				int menu1 = sc.nextInt();
				if(menu1==1) {
					System.out.println("일반세탁");
					price = price + 3000;
				} else if(menu1==2){
					System.out.println("고급세탁");
					price = price + 4000;
				} else {
					System.out.println("다시선택해주세요.");
				}
			} 
			break;
		case 2:
			System.out.println("헹굼");
			if(menu==2) {
				System.out.println("헹굼 강도를 선택해주세요.");
				System.out.println("1.약 2.중 3.강");
			    int menu1 = sc.nextInt();
			    if(menu1==1) {
			    	System.out.println("약");
			    	price = price + 500;	
			    } else if(menu1==2) {
		    		System.out.println("중");
		    		price = price + 1000;
		    	} else if(menu1==3) {
		    		System.out.println("강");
		    		price = price + 1500;
		    	} else {
		    		System.out.println("다시 선택해주세요.");
		    	}
				
			}
			
			break;
		case 3:
			System.out.println("탈수");
			if(menu==3) {
				System.out.println("탈수 강도를 선택해주세요.");
				System.out.println("1.약 2.중 3.강");
			    int menu1 = sc.nextInt();
			    if(menu1==1) {
			    	System.out.println("약");	
			    	price = price + 500;
			    } else if(menu1==2) {
		    		System.out.println("중");
		    		price = price + 1000;
		    	} else if(menu1==3) {
		    		System.out.println("강");
		    		price = price + 1500;
		    	} else {
		    		System.out.println("다시 선택해주세요.");
		    	}
				
			}
			break;
		case 4:
			System.out.println("건조");
			if(menu==4) {
				System.out.println("건조 시간을 선택해주세요.");
				System.out.println("1.40분 2.60분 3.80분");
			    int menu1 = sc.nextInt();
			    if(menu1==1) {
			    	System.out.println("40분");	
			    	price = price + 1000;
			    } else if(menu1==2) {
		    		System.out.println("60분");
		    		price = price + 1500;
		    	} else if(menu1==3) {
		    		System.out.println("80분");
		    		price = price + 2000;
		    	} else {
		    		System.out.println("다시 선택해주세요.");
		    	}
				
			}
			break;
		case 5:
			System.out.println("신발세탁");
			if(menu==5) {
				System.out.println("신발 켤레를 선택해주세요.");
			    int menu1 = sc.nextInt();
			    if(menu1==1) {
			    	System.out.println("1");	
			    	price = price + 1000;
			    } else if(menu1==2) {
		    		System.out.println("2");
		    		price = price + 2000;
		    	} else if(menu1==3) {
		    		System.out.println("3");
		    		price = price + 3000;
		    	} else {
		    		System.out.println("세탁가능 신발 켤레는 3켤레가 최대입니다.");
		    	}
				
			}	
			break;
		case 6:
			run = false;
			System.out.println("선택해주신 세탁코스 비용은 : "+ price + "입니다.");
			System.out.println("감사합니다. 다음에 또 오세요:)");
			break;
		default:
			System.out.println("해당메뉴는 없습니다 다시 선택해주세요.");
			break;
		}
		
		
		
	 }

	}	
}
