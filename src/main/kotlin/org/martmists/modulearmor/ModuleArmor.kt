package org.martmists.modulearmor

import net.minecraftforge.fml.common.Mod
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent

@Mod(modid = "modulearmor", modLanguageAdapter = "net.shadowfacts.forgelin.KotlinAdapter")
object ModuleArmor {

    @Mod.EventHandler
    fun preInit(event: FMLPreInitializationEvent) {
        println("Hello from Kotlin!")
    }

}