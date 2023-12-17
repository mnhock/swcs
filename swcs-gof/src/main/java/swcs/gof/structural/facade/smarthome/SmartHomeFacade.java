package swcs.gof.structural.facade.smarthome;

class SmartHomeFacade {

  private final LightController lightController;
  private final ThermostatController thermostatController;
  private final SecuritySystem securitySystem;

  SmartHomeFacade() {
    this.lightController = new LightController();
    this.thermostatController = new ThermostatController();
    this.securitySystem = new SecuritySystem();
  }

  public void leaveHome() {
    this.lightController.turnOffLights();
    this.thermostatController.setTemperature(18);
    this.securitySystem.armSystem();
  }

  public void returnHome() {
    this.securitySystem.disarmSystem();
    this.lightController.turnOnLights();
    this.thermostatController.setTemperature(22);
  }
}
