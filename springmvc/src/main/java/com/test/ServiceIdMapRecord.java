package com.test;

public class ServiceIdMapRecord{

  private Long inventorySource;

  private Long ssServiceId;

  private String vendorServiceId;

  /**
   * new column added to accommodate routeId-vendorId map as IAS maintains their routeIds based on
   * our route ids for bogds operators.
   */
  private Long ssRouteId;

  public ServiceIdMapRecord(long l, long l1, String a, long l2) {
    this.inventorySource=l;
    this.ssRouteId=l1;
    this.ssServiceId=l2;
    this.vendorServiceId=a;
  }

  public Long getInventorySource() {
    return inventorySource;
  }

  public void setInventorySource(Long inventorySource) {
    this.inventorySource = inventorySource;
  }

  public Long getSsServiceId() {
    return ssServiceId;
  }

  public void setSsServiceId(Long ssServiceId) {
    this.ssServiceId = ssServiceId;
  }

  public String getVendorServiceId() {
    return vendorServiceId;
  }

  public void setVendorServiceId(String vendorServiceId) {
    this.vendorServiceId = vendorServiceId;
  }

  public Long getSsRouteId() {
    return ssRouteId;
  }

  public void setSsRouteId(Long ssRouteId) {
    this.ssRouteId = ssRouteId;
  }

  @Override
  public String toString() {
    return "ServiceIdMapRecord [inventorySource=" + inventorySource + ", ssServiceId="
        + ssServiceId
        + ", vendorServiceId=" + vendorServiceId + ", ssRouteId=" + ssRouteId + "]";
  }

}