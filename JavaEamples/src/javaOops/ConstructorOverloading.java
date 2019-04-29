package javaOops;


	public class ConstructorOverloading {

		int id;
		String name;
		int age;

		ConstructorOverloading(int i, String n) {
			id = i;
			name = n;
			// System.out.println(id + " " + name );
		}

		ConstructorOverloading(int i, String n, int a) {
			id = i;
			name = n;
			age = a;
			// System.out.println(id + " " + name + " " + age);
		}

		void display() {

			System.out.println(id + " " + name + " " + age);
		}

		public static void main(String args[]) {
			ConstructorOverloading s1 = new ConstructorOverloading(111, "Pardymna");
			ConstructorOverloading s2 = new ConstructorOverloading(222, "Poonam", 25);
			s1.display();
			s2.display();
		}
	}


