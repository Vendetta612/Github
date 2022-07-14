package com.example.designpattern.strategy;
public class test {
	public static void main(String[] args) {
		Player p = new Player();
		Wand w = new Wand("Elder Wand");
		p.EquipWeapon(w);
		w.getName();
		
		w.setAttackStrategy(new Cast());
		p.attack();
		
		System.out.println("\nYou are out of mana!");
		w.setAttackStrategy(new Slash());
		p.attack();
	}
}