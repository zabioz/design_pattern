package AbstractFactory;

public class Main {
	public static void main(String[] args) {
		MachineFactory machineFactoryA = new MachineFactoryA();
		machineFactoryA.getMachineA().process();
		machineFactoryA.getMachineB().process();
		
		MachineFactory machineFactoryB = new MachineFactoryB();
		machineFactoryB.getMachineA().process();
		machineFactoryB.getMachineB().process();
	}

}
