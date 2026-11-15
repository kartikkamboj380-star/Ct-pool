.class Lcom/tenjin/android/store/QueueEventDao_Impl$2;
.super Landroidx/room/h;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/tenjin/android/store/QueueEventDao_Impl;-><init>(Landroidx/room/u;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/room/h;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/tenjin/android/store/QueueEventDao_Impl;


# direct methods
.method constructor <init>(Lcom/tenjin/android/store/QueueEventDao_Impl;Landroidx/room/u;)V
    .locals 0

    iput-object p1, p0, Lcom/tenjin/android/store/QueueEventDao_Impl$2;->this$0:Lcom/tenjin/android/store/QueueEventDao_Impl;

    invoke-direct {p0, p2}, Landroidx/room/h;-><init>(Landroidx/room/u;)V

    return-void
.end method


# virtual methods
.method public bind(LZ/k;Lcom/tenjin/android/store/QueueEvent;)V
    .locals 2

    .line 1
    invoke-virtual {p2}, Lcom/tenjin/android/store/QueueEvent;->getId()I

    move-result p2

    int-to-long v0, p2

    const/4 p2, 0x1

    invoke-interface {p1, p2, v0, v1}, LZ/i;->b0(IJ)V

    return-void
.end method

.method public bridge synthetic bind(LZ/k;Ljava/lang/Object;)V
    .locals 0

    .line 2
    check-cast p2, Lcom/tenjin/android/store/QueueEvent;

    invoke-virtual {p0, p1, p2}, Lcom/tenjin/android/store/QueueEventDao_Impl$2;->bind(LZ/k;Lcom/tenjin/android/store/QueueEvent;)V

    return-void
.end method

.method public createQuery()Ljava/lang/String;
    .locals 1

    const-string v0, "DELETE FROM `QueueEvent` WHERE `id` = ?"

    return-object v0
.end method
