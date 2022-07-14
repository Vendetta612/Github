package com.example.designpattern.strategy;
public class Player{
	private Weapon w;
	
	public void EquipWeapon(Weapon weapon) {
		this.w = weapon;
	}
	
	public void attack() {
		w.attack();
	}
}