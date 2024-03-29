/*
 * Copyright 1999-2022 Alibaba Group Holding Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package ltd.hellodream.nacos.plugin.datasource.impl.postgresql;

import com.alibaba.nacos.plugin.datasource.mapper.AbstractMapper;
import com.alibaba.nacos.plugin.datasource.mapper.TenantInfoMapper;
import ltd.hellodream.nacos.plugin.datasource.constants.DataSourceConstant;

/**
 * The PostgreSQL implementation of {@link TenantInfoMapper}.
 *
 * @author HelloDream
 **/

public class TenantInfoMapperByPostgreSQL extends AbstractMapper implements TenantInfoMapper {

    @Override
    public String getDataSource() {
        return DataSourceConstant.POSTGRESQL;
    }
}
