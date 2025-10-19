package swcs.dp.lsp.shipping.before;

class LocalPickup extends ShippingMethod {

  @Override
  void track(String trackingId) {
    throw new UnsupportedOperationException("Local pickup cannot be tracked!");
  }
}
