/*카페를 운영하는 사람이 있습니다.
단골손님들은 매일 마시는 음료가 정해져 있습니다.
단골손님A는 항상 아이스 아메리카노를 주문합니다.
단골손님B는 매일 아침 딸기라떼를 구매합니다.*/

interface Customer {
    // 상수
    // 추상 메서드
    String getOrder();
}
// CafeCustomer 클래스로부터 단골 A와 B 손님 상속
// implement 키워드 사용하여 인터페이스 구현
class CafeCustomerA implements Customer{
    public String getOrder(){
        return "a glass of iced americano";
    }
}
class CafeCustomerB implements Customer {
    public String getOrder() {
        return "a glass of iced strawberry latte";
    }
}
//카페 사장님
//인터페이스와 참조변수의 형변환을 사용하면 아래의 코드처럼 Customer 타입을 매개변수로 전달
class CafeOwner {
   /* public void giveItem(CafeCustomerB cafeCustomerB){
        System.out.println("give a glass of strawberry latte to CafeCustomer B");
    }
    public void giveItem(CafeCustomerA cafeCustomerA){
        System.out.println("give a glass of iced americano to CafeCustomer A");
    }*/
   public void giveItem(Customer customer){
       System.out.println("Item : " + customer.getOrder());
   }
}

// 메뉴주문
public class OrderExample {
    public static void main(String[] args) {
        CafeOwner cafeowner = new CafeOwner();
        Customer cafeCustomerA = new CafeCustomerA();
        Customer cafeCustomerB = new CafeCustomerB();

        /*cafeowner.giveItem(a);
        cafeowner.giveItem(b);*/
        cafeowner.giveItem(cafeCustomerA);
        cafeowner.giveItem(cafeCustomerB);
    }
}

// 출력값
// Item : a glass of iced americano
// Item : a glass oi strawberry latte