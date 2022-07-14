package com.example.designpattern.strategy;
public abstract class Weapon{
	private String name;
	private AttackStrategy AttackStrategy;
	
	public Weapon(String name) {
		this.name = name;
	}
	
	public void getName() {
		System.out.printf("Equipped Weapon: %s\n", name);
	}
	
	public void attack() {
		AttackStrategy.attack();
	}
	
	public void setAttackStrategy(AttackStrategy AS) {
		this.AttackStrategy = AS;
	}
}