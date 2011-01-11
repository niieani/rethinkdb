#ifndef __BTREE_CO_FUNCTIONS_HPP__
#define __BTREE_CO_FUNCTIONS_HPP__

#include "buffer_cache/buffer_cache.hpp"
#include "buffer_cache/large_buf.hpp"

buf_t *co_acquire_transaction(transaction_t *transaction, block_id_t block_id, access_t mode);
void co_acquire_large_value(large_buf_t *large_value, large_buf_ref root_ref_, access_t access_);


#endif  // __BTREE_CO_FUNCTIONS_HPP__
