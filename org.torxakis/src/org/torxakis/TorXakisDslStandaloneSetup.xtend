/*
 * generated by Xtext 2.12.0
 */
package org.torxakis


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class TorXakisDslStandaloneSetup extends TorXakisDslStandaloneSetupGenerated {

	def static void doSetup() {
		new TorXakisDslStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}