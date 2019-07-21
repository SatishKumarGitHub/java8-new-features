package com.java8.groupingby;

public class Player {

	private String name;

	private int age;

	private PlayerType type;

	public Player() {
	}

	public Player(String name, int age, PlayerType type) {
		super();
		this.name = name;
		this.age = age;
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public PlayerType getType() {
		return type;
	}

	public void setType(PlayerType type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Player [name=" + name + ", age=" + age + ", type=" + type + "]";
	}

}
