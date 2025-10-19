package swcs.dp.lsp.shipping.after;

sealed interface TrackableShipping extends ShippingMethod permits ExpressShipping,
    StandardShipping {

  void track(String trackingId);
}