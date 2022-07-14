package com.example.designpattern.strategy;
public class Shoot implements AttackStrategy{
	public void attack(){
		System.out.println("Range: Long, Attribute: Physical");
	}
}