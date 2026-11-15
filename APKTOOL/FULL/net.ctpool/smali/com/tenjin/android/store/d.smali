.class public final synthetic Lcom/tenjin/android/store/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:Lcom/tenjin/android/store/TenjinDatasource;

.field public final synthetic b:Lcom/tenjin/android/store/QueueEvent;


# direct methods
.method public synthetic constructor <init>(Lcom/tenjin/android/store/TenjinDatasource;Lcom/tenjin/android/store/QueueEvent;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/tenjin/android/store/d;->a:Lcom/tenjin/android/store/TenjinDatasource;

    iput-object p2, p0, Lcom/tenjin/android/store/d;->b:Lcom/tenjin/android/store/QueueEvent;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tenjin/android/store/d;->a:Lcom/tenjin/android/store/TenjinDatasource;

    iget-object v1, p0, Lcom/tenjin/android/store/d;->b:Lcom/tenjin/android/store/QueueEvent;

    invoke-static {v0, v1}, Lcom/tenjin/android/store/TenjinDatasource;->b(Lcom/tenjin/android/store/TenjinDatasource;Lcom/tenjin/android/store/QueueEvent;)Ljava/lang/Long;

    move-result-object v0

    return-object v0
.end method
