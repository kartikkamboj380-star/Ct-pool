.class final LP4/c$d;
.super Lo5/k;
.source "SourceFile"

# interfaces
.implements Lv5/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LP4/c;->d(Lm5/d;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field q:Ljava/lang/Object;

.field r:Ljava/lang/Object;

.field s:I

.field synthetic t:Ljava/lang/Object;

.field final synthetic u:LP4/c;


# direct methods
.method constructor <init>(LP4/c;Lm5/d;)V
    .locals 0

    .line 1
    iput-object p1, p0, LP4/c$d;->u:LP4/c;

    .line 2
    .line 3
    const/4 p1, 0x2

    .line 4
    invoke-direct {p0, p1, p2}, Lo5/k;-><init>(ILm5/d;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final d(Ljava/lang/Object;Lm5/d;)Lm5/d;
    .locals 2

    .line 1
    new-instance v0, LP4/c$d;

    .line 2
    .line 3
    iget-object v1, p0, LP4/c$d;->u:LP4/c;

    .line 4
    .line 5
    invoke-direct {v0, v1, p2}, LP4/c$d;-><init>(LP4/c;Lm5/d;)V

    .line 6
    .line 7
    .line 8
    iput-object p1, v0, LP4/c$d;->t:Ljava/lang/Object;

    .line 9
    .line 10
    return-object v0
.end method

.method public bridge synthetic m(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lorg/json/JSONObject;

    .line 2
    .line 3
    check-cast p2, Lm5/d;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, LP4/c$d;->v(Lorg/json/JSONObject;Lm5/d;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
.end method

.method public final s(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    const-string v0, "cache_duration"

    const-string v1, "session_timeout_seconds"

    const-string v2, "sampling_rate"

    const-string v3, "sessions_enabled"

    invoke-static {}, Ln5/b;->c()Ljava/lang/Object;

    move-result-object v4

    iget v5, p0, LP4/c$d;->s:I

    const/4 v6, 0x0

    packed-switch v5, :pswitch_data_0

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_0
    invoke-static {p1}, Li5/n;->b(Ljava/lang/Object;)V

    goto/16 :goto_b

    :pswitch_1
    invoke-static {p1}, Li5/n;->b(Ljava/lang/Object;)V

    goto/16 :goto_a

    :pswitch_2
    invoke-static {p1}, Li5/n;->b(Ljava/lang/Object;)V

    goto/16 :goto_8

    :pswitch_3
    iget-object v0, p0, LP4/c$d;->t:Ljava/lang/Object;

    check-cast v0, Lw5/v;

    invoke-static {p1}, Li5/n;->b(Ljava/lang/Object;)V

    goto/16 :goto_7

    :pswitch_4
    iget-object v0, p0, LP4/c$d;->q:Ljava/lang/Object;

    check-cast v0, Lw5/v;

    iget-object v1, p0, LP4/c$d;->t:Ljava/lang/Object;

    check-cast v1, Lw5/v;

    invoke-static {p1}, Li5/n;->b(Ljava/lang/Object;)V

    goto/16 :goto_6

    :pswitch_5
    iget-object v0, p0, LP4/c$d;->r:Ljava/lang/Object;

    check-cast v0, Lw5/v;

    iget-object v1, p0, LP4/c$d;->q:Ljava/lang/Object;

    check-cast v1, Lw5/v;

    iget-object v2, p0, LP4/c$d;->t:Ljava/lang/Object;

    check-cast v2, Lw5/v;

    invoke-static {p1}, Li5/n;->b(Ljava/lang/Object;)V

    goto/16 :goto_4

    :pswitch_6
    invoke-static {p1}, Li5/n;->b(Ljava/lang/Object;)V

    iget-object p1, p0, LP4/c$d;->t:Ljava/lang/Object;

    check-cast p1, Lorg/json/JSONObject;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "Fetched settings: "

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    const-string v7, "SessionConfigFetcher"

    invoke-static {v7, v5}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    new-instance v5, Lw5/v;

    invoke-direct {v5}, Lw5/v;-><init>()V

    new-instance v8, Lw5/v;

    invoke-direct {v8}, Lw5/v;-><init>()V

    new-instance v9, Lw5/v;

    invoke-direct {v9}, Lw5/v;-><init>()V

    const-string v10, "app_quality"

    invoke-virtual {p1, v10}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v11

    if-eqz v11, :cond_3

    invoke-virtual {p1, v10}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    const-string v10, "null cannot be cast to non-null type org.json.JSONObject"

    invoke-static {p1, v10}, Lw5/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lorg/json/JSONObject;

    :try_start_0
    invoke-virtual {p1, v3}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v10

    if-eqz v10, :cond_0

    invoke-virtual {p1, v3}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Boolean;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    move-object v3, v6

    goto :goto_2

    :cond_0
    move-object v3, v6

    :goto_0
    :try_start_1
    invoke-virtual {p1, v2}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v10

    if-eqz v10, :cond_1

    invoke-virtual {p1, v2}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Double;

    iput-object v2, v5, Lw5/v;->m:Ljava/lang/Object;

    goto :goto_1

    :catch_1
    move-exception p1

    goto :goto_2

    :cond_1
    :goto_1
    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    iput-object v1, v8, Lw5/v;->m:Ljava/lang/Object;

    :cond_2
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    iput-object p1, v9, Lw5/v;->m:Ljava/lang/Object;
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_3

    :goto_2
    const-string v0, "Error parsing the configs remotely fetched: "

    invoke-static {v7, v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_3

    :cond_3
    move-object v3, v6

    :cond_4
    :goto_3
    if-eqz v3, :cond_6

    iget-object p1, p0, LP4/c$d;->u:LP4/c;

    invoke-static {p1}, LP4/c;->e(LP4/c;)LP4/g;

    move-result-object p1

    iput-object v5, p0, LP4/c$d;->t:Ljava/lang/Object;

    iput-object v8, p0, LP4/c$d;->q:Ljava/lang/Object;

    iput-object v9, p0, LP4/c$d;->r:Ljava/lang/Object;

    const/4 v0, 0x1

    iput v0, p0, LP4/c$d;->s:I

    invoke-virtual {p1, v3, p0}, LP4/g;->n(Ljava/lang/Boolean;Lm5/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v4, :cond_5

    return-object v4

    :cond_5
    move-object v2, v5

    move-object v1, v8

    move-object v0, v9

    :goto_4
    move-object v8, v1

    move-object v1, v2

    goto :goto_5

    :cond_6
    move-object v1, v5

    move-object v0, v9

    :goto_5
    iget-object p1, v8, Lw5/v;->m:Ljava/lang/Object;

    check-cast p1, Ljava/lang/Integer;

    if-eqz p1, :cond_7

    iget-object p1, p0, LP4/c$d;->u:LP4/c;

    invoke-static {p1}, LP4/c;->e(LP4/c;)LP4/g;

    move-result-object p1

    iget-object v2, v8, Lw5/v;->m:Ljava/lang/Object;

    check-cast v2, Ljava/lang/Integer;

    iput-object v1, p0, LP4/c$d;->t:Ljava/lang/Object;

    iput-object v0, p0, LP4/c$d;->q:Ljava/lang/Object;

    iput-object v6, p0, LP4/c$d;->r:Ljava/lang/Object;

    const/4 v3, 0x2

    iput v3, p0, LP4/c$d;->s:I

    invoke-virtual {p1, v2, p0}, LP4/g;->m(Ljava/lang/Integer;Lm5/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v4, :cond_7

    return-object v4

    :cond_7
    :goto_6
    iget-object p1, v1, Lw5/v;->m:Ljava/lang/Object;

    check-cast p1, Ljava/lang/Double;

    if-eqz p1, :cond_8

    iget-object p1, p0, LP4/c$d;->u:LP4/c;

    invoke-static {p1}, LP4/c;->e(LP4/c;)LP4/g;

    move-result-object p1

    iget-object v1, v1, Lw5/v;->m:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Double;

    iput-object v0, p0, LP4/c$d;->t:Ljava/lang/Object;

    iput-object v6, p0, LP4/c$d;->q:Ljava/lang/Object;

    iput-object v6, p0, LP4/c$d;->r:Ljava/lang/Object;

    const/4 v2, 0x3

    iput v2, p0, LP4/c$d;->s:I

    invoke-virtual {p1, v1, p0}, LP4/g;->i(Ljava/lang/Double;Lm5/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v4, :cond_8

    return-object v4

    :cond_8
    :goto_7
    iget-object p1, v0, Lw5/v;->m:Ljava/lang/Object;

    check-cast p1, Ljava/lang/Integer;

    if-eqz p1, :cond_a

    iget-object p1, p0, LP4/c$d;->u:LP4/c;

    invoke-static {p1}, LP4/c;->e(LP4/c;)LP4/g;

    move-result-object p1

    iget-object v0, v0, Lw5/v;->m:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Integer;

    iput-object v6, p0, LP4/c$d;->t:Ljava/lang/Object;

    iput-object v6, p0, LP4/c$d;->q:Ljava/lang/Object;

    iput-object v6, p0, LP4/c$d;->r:Ljava/lang/Object;

    const/4 v1, 0x4

    iput v1, p0, LP4/c$d;->s:I

    invoke-virtual {p1, v0, p0}, LP4/g;->j(Ljava/lang/Integer;Lm5/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v4, :cond_9

    return-object v4

    :cond_9
    :goto_8
    sget-object p1, Li5/u;->a:Li5/u;

    goto :goto_9

    :cond_a
    move-object p1, v6

    :goto_9
    if-nez p1, :cond_b

    iget-object p1, p0, LP4/c$d;->u:LP4/c;

    invoke-static {p1}, LP4/c;->e(LP4/c;)LP4/g;

    move-result-object p1

    const v0, 0x15180

    invoke-static {v0}, Lo5/b;->b(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v6, p0, LP4/c$d;->t:Ljava/lang/Object;

    iput-object v6, p0, LP4/c$d;->q:Ljava/lang/Object;

    iput-object v6, p0, LP4/c$d;->r:Ljava/lang/Object;

    const/4 v1, 0x5

    iput v1, p0, LP4/c$d;->s:I

    invoke-virtual {p1, v0, p0}, LP4/g;->j(Ljava/lang/Integer;Lm5/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v4, :cond_b

    return-object v4

    :cond_b
    :goto_a
    iget-object p1, p0, LP4/c$d;->u:LP4/c;

    invoke-static {p1}, LP4/c;->e(LP4/c;)LP4/g;

    move-result-object p1

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {v0, v1}, Lo5/b;->c(J)Ljava/lang/Long;

    move-result-object v0

    iput-object v6, p0, LP4/c$d;->t:Ljava/lang/Object;

    iput-object v6, p0, LP4/c$d;->q:Ljava/lang/Object;

    iput-object v6, p0, LP4/c$d;->r:Ljava/lang/Object;

    const/4 v1, 0x6

    iput v1, p0, LP4/c$d;->s:I

    invoke-virtual {p1, v0, p0}, LP4/g;->k(Ljava/lang/Long;Lm5/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v4, :cond_c

    return-object v4

    :cond_c
    :goto_b
    sget-object p1, Li5/u;->a:Li5/u;

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final v(Lorg/json/JSONObject;Lm5/d;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, LP4/c$d;->d(Ljava/lang/Object;Lm5/d;)Lm5/d;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, LP4/c$d;

    .line 6
    .line 7
    sget-object p2, Li5/u;->a:Li5/u;

    .line 8
    .line 9
    invoke-virtual {p1, p2}, LP4/c$d;->s(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1
.end method
