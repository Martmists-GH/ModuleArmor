package org.martmists.giraffearmor

import net.minecraftforge.fml.common.Mod
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent

@Mod(modid = "GiraffeArmor", modLanguageAdapter = "net.shadowfacts.forgelin.KotlinAdapter")
object GiraffeArmor {

    @Mod.EventHandler
    fun preInit(event: FMLPreInitializationEvent) {
        println("Hello from Kotlin!")
    }

}