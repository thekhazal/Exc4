/*****************************************************
 * jr generated file
 ****************************************************/
import edu.ucdavis.jr.*;
import edu.ucdavis.jr.jrx.*;
import java.rmi.*;
import java.io.Serializable;

    public class JRSimpleClock
      extends JRjavadotlangdotObject
      implements Serializable, Cloneable
    {
	static final long serialVersionUID = 0;
	public Cap_ext_ op_listener_voidTovoid;
	public Cap_ext_ JRget_op_listener_voidTovoid() {
		return op_listener_voidTovoid;
	}
	public void JRset_op_listener_voidTovoid(Cap_ext_ op_listener_voidTovoid) {
		this.op_listener_voidTovoid = op_listener_voidTovoid;
	}

	public Cap_ext_ op_timer_Cap_voidTovoidXintTovoid;
	public Cap_ext_ JRget_op_timer_Cap_voidTovoidXintTovoid() {
		return op_timer_Cap_voidTovoidXintTovoid;
	}
	public void JRset_op_timer_Cap_voidTovoidXintTovoid(Cap_ext_ op_timer_Cap_voidTovoidXintTovoid) {
		this.op_timer_Cap_voidTovoidXintTovoid = op_timer_Cap_voidTovoidXintTovoid;
	}

	public Cap_ext_ op_ticker_voidTovoid;
	public Cap_ext_ JRget_op_ticker_voidTovoid() {
		return op_ticker_voidTovoid;
	}
	public void JRset_op_ticker_voidTovoid(Cap_ext_ op_ticker_voidTovoid) {
		this.op_ticker_voidTovoid = op_ticker_voidTovoid;
	}

	public Cap_ext_ op_tickKILL_voidTovoid;
	public Cap_ext_ JRget_op_tickKILL_voidTovoid() {
		return op_tickKILL_voidTovoid;
	}
	public void JRset_op_tickKILL_voidTovoid(Cap_ext_ op_tickKILL_voidTovoid) {
		this.op_tickKILL_voidTovoid = op_tickKILL_voidTovoid;
	}

	public Cap_ext_ op_alarm_voidTovoid;
	public Cap_ext_ JRget_op_alarm_voidTovoid() {
		return op_alarm_voidTovoid;
	}
	public void JRset_op_alarm_voidTovoid(Cap_ext_ op_alarm_voidTovoid) {
		this.op_alarm_voidTovoid = op_alarm_voidTovoid;
	}

	public Cap_ext_ op_tick_voidTovoid;
	public Cap_ext_ JRget_op_tick_voidTovoid() {
		return op_tick_voidTovoid;
	}
	public void JRset_op_tick_voidTovoid(Cap_ext_ op_tick_voidTovoid) {
		this.op_tick_voidTovoid = op_tick_voidTovoid;
	}

	public JRSimpleClock(JRSimpleClock copy)
	{
	this.op_listener_voidTovoid = copy.op_listener_voidTovoid;
	this.op_timer_Cap_voidTovoidXintTovoid = copy.op_timer_Cap_voidTovoidXintTovoid;
	this.op_ticker_voidTovoid = copy.op_ticker_voidTovoid;
	this.op_tickKILL_voidTovoid = copy.op_tickKILL_voidTovoid;
	this.op_alarm_voidTovoid = copy.op_alarm_voidTovoid;
	this.op_tick_voidTovoid = copy.op_tick_voidTovoid;

	}
	public JRSimpleClock(Object ... opSig)
	{
	this.op_listener_voidTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[0]);
	this.op_timer_Cap_voidTovoidXintTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[1]);
	this.op_ticker_voidTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[2]);
	this.op_tickKILL_voidTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[3]);
	this.op_alarm_voidTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[4]);
	this.op_tick_voidTovoid = new Cap_ext_((Op_ext_.JRProxyOp)opSig[5]);

	}
	public JRSimpleClock(boolean dummy)	{
	    super(dummy);
	this.op_listener_voidTovoid = Cap_ext_.noop;
	this.op_timer_Cap_voidTovoidXintTovoid = Cap_ext_.noop;
	this.op_ticker_voidTovoid = Cap_ext_.noop;
	this.op_tickKILL_voidTovoid = Cap_ext_.noop;
	this.op_alarm_voidTovoid = Cap_ext_.noop;
	this.op_tick_voidTovoid = Cap_ext_.noop;

	}
	public Object clone()
	    throws CloneNotSupportedException
	{
	    return super.clone();
	}
	public static Object getNoop()
	{
	    return new JRSimpleClock(true);
	}
    }
