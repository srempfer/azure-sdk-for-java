// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.vmwarecloudsimple.models;

import com.azure.resourcemanager.vmwarecloudsimple.fluent.models.VirtualMachineTemplateInner;
import java.util.List;

/**
 * An immutable client-side representation of VirtualMachineTemplate.
 */
public interface VirtualMachineTemplate {
    /**
     * Gets the id property: virtual machine template id (privateCloudId:vsphereId).
     * 
     * @return the id value.
     */
    String id();

    /**
     * Gets the location property: Azure region.
     * 
     * @return the location value.
     */
    String location();

    /**
     * Gets the name property: {virtualMachineTemplateName}.
     * 
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: {resourceProviderNamespace}/{resourceType}.
     * 
     * @return the type value.
     */
    String type();

    /**
     * Gets the amountOfRam property: The amount of memory.
     * 
     * @return the amountOfRam value.
     */
    Integer amountOfRam();

    /**
     * Gets the controllers property: The list of Virtual Disk Controllers.
     * 
     * @return the controllers value.
     */
    List<VirtualDiskController> controllers();

    /**
     * Gets the description property: The description of Virtual Machine Template.
     * 
     * @return the description value.
     */
    String description();

    /**
     * Gets the disks property: The list of Virtual Disks.
     * 
     * @return the disks value.
     */
    List<VirtualDisk> disks();

    /**
     * Gets the exposeToGuestVM property: Expose Guest OS or not.
     * 
     * @return the exposeToGuestVM value.
     */
    Boolean exposeToGuestVM();

    /**
     * Gets the guestOS property: The Guest OS.
     * 
     * @return the guestOS value.
     */
    String guestOS();

    /**
     * Gets the guestOSType property: The Guest OS types.
     * 
     * @return the guestOSType value.
     */
    String guestOSType();

    /**
     * Gets the nics property: The list of Virtual NICs.
     * 
     * @return the nics value.
     */
    List<VirtualNic> nics();

    /**
     * Gets the numberOfCores property: The number of CPU cores.
     * 
     * @return the numberOfCores value.
     */
    Integer numberOfCores();

    /**
     * Gets the path property: path to folder.
     * 
     * @return the path value.
     */
    String path();

    /**
     * Gets the privateCloudId property: The Private Cloud Id.
     * 
     * @return the privateCloudId value.
     */
    String privateCloudId();

    /**
     * Gets the vSphereNetworks property: The list of VSphere networks.
     * 
     * @return the vSphereNetworks value.
     */
    List<String> vSphereNetworks();

    /**
     * Gets the vSphereTags property: The tags from VSphere.
     * 
     * @return the vSphereTags value.
     */
    List<String> vSphereTags();

    /**
     * Gets the vmwaretools property: The VMware tools version.
     * 
     * @return the vmwaretools value.
     */
    String vmwaretools();

    /**
     * Gets the inner com.azure.resourcemanager.vmwarecloudsimple.fluent.models.VirtualMachineTemplateInner object.
     * 
     * @return the inner object.
     */
    VirtualMachineTemplateInner innerModel();
}
