package Abstraction;

public class DairyMilk implements ChocolateShop {
	private String shopName="FIREFLINK CHOCOLATE SHOP";
	

	public String getShopName() {
		return shopName;
	}


	public void setShopName(String shopName) {
		this.shopName = shopName;
	}


	@Override
	public void chocolate() {
		System.out.println("hi i'm dairyMilk i'm in brown color");
		
	}

}
class MilkyBar implements ChocolateShop
{
private String shopName="FIREFLINK CHOCOLATE SHOP";
	

	public String getShopName() {
		return shopName;
	}


	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	@Override
	public void chocolate() {
		System.out.println("hi i'm MilkyBar i'm in white color");
		
	}
	
}
class Perk implements ChocolateShop
{
private String shopName="FIREFLINK CHOCOLATE SHOP";
	

	public String getShopName() {
		return shopName;
	}


	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	@Override
	public void chocolate() {
		System.out.println("hi i'm Perk i'm in light brown color");
		
	}
	
}
class KitKat implements ChocolateShop
{
private String shopName="FIREFLINK CHOCOLATE SHOP";
	

	public String getShopName() {
		return shopName;
	}


	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	@Override
	public void chocolate() {
	System.out.println("hi i'm KitKat i'm doble layered chocolate");
		
	}
}