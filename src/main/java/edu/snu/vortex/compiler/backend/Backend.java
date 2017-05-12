/*
 * Copyright (C) 2017 Seoul National University
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package edu.snu.vortex.compiler.backend;

import edu.snu.vortex.compiler.ir.IREdge;
import edu.snu.vortex.compiler.ir.IRVertex;
import edu.snu.vortex.utils.dag.DAG;

/**
 * Interface for backend components.
 * @param <ExecPlan> execution plan to compile the DAG into.
 */
public interface Backend<ExecPlan> {
  /**
   * Compiles a DAG to an execution plan.
   * @param dag DAG to compile.
   * @return the execution plan generated.
   * @throws Exception Exception on the way.
   */
  ExecPlan compile(DAG<IRVertex, IREdge> dag) throws Exception;
}