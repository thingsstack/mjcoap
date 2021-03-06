/*
 * Copyright (c) 2018 NetSec Lab - University of Parma (Italy)
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND. IN NO EVENT
 * SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR
 * OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE,
 * ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER
 * DEALINGS IN THE SOFTWARE.
 *
 * Author(s):
 * Luca Veltri (luca.veltri@unipr.it)
 */

package it.unipr.netsec.thingsstack.coap.blockwise;


import it.unipr.netsec.thingsstack.coap.message.CoapRequest;
import it.unipr.netsec.thingsstack.coap.transaction.CoapTransactionServer;


/** Listens for server-side blockwise transfer events.
 */
public interface BlockwiseTransactionServerListener {
	
	/** When a new CoAP request message is received.
	 * @param ts the blockwise transaction server
	 * @param req the received CoAP request */
	public void onReceivedRequest(BlockwiseTransactionServer ts, CoapRequest req);

	/** When a RST is received for a Confirmable response or transaction timeout expired.
	 * @param ts the blockwise transaction server */
	public void onTransactionFailure(CoapTransactionServer ts);

}
