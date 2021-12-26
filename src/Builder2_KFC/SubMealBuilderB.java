package Builder2_KFC;

public class SubMealBuilderB extends MealBuilder
{
	public void buildFood() { // 对套餐产品中的主食建造方法进行实现
		meal.setFood("双层牛肉汉堡");
	}
	public void buildDrink() { // 对套餐产品中的饮料建造方法进行实现
		 meal.setDrink("奶茶");
	}
}