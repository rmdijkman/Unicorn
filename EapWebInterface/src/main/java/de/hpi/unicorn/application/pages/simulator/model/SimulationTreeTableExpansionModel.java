/*******************************************************************************
 *
 * Copyright (c) 2012-2015, Business Process Technology (BPT),
 * http://bpt.hpi.uni-potsdam.de. 
 * All Rights Reserved.
 *
 *******************************************************************************/
package de.hpi.unicorn.application.pages.simulator.model;

import java.util.Set;

import org.apache.wicket.model.AbstractReadOnlyModel;

/**
 * model that wraps the expansion state handler of a tree component
 */
public class SimulationTreeTableExpansionModel<T> extends AbstractReadOnlyModel<Set<SimulationTreeTableElement<T>>> {

	private static final long serialVersionUID = 1L;

	@Override
	public Set<SimulationTreeTableElement<T>> getObject() {
		return SimulationTreeTableExpansion.get();
	}
}
