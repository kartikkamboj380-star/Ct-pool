.class Lcom/tenjin/android/store/QueueEventDao_Impl$1;
.super Landroidx/room/i;
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
        "Landroidx/room/i;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/tenjin/android/store/QueueEventDao_Impl;


# direct methods
.method constructor <init>(Lcom/tenjin/android/store/QueueEventDao_Impl;Landroidx/room/u;)V
    .locals 0

    iput-object p1, p0, Lcom/tenjin/android/store/QueueEventDao_Impl$1;->this$0:Lcom/tenjin/android/store/QueueEventDao_Impl;

    invoke-direct {p0, p2}, Landroidx/room/i;-><init>(Landroidx/room/u;)V

    return-void
.end method


# virtual methods
.method public bind(LZ/k;Lcom/tenjin/android/store/QueueEvent;)V
    .locals 4

    .line 1
    invoke-virtual {p2}, Lcom/tenjin/android/store/QueueEvent;->getId()I

    move-result v0

    int-to-long v0, v0

    const/4 v2, 0x1

    invoke-interface {p1, v2, v0, v1}, LZ/i;->b0(IJ)V

    invoke-virtual {p2}, Lcom/tenjin/android/store/QueueEvent;->getParams()Ljava/util/Map;

    move-result-object v0

    invoke-static {v0}, Lcom/tenjin/android/store/TenjinRoomConverters;->fromMap(Ljava/util/Map;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    if-nez v0, :cond_0

    invoke-interface {p1, v1}, LZ/i;->A0(I)V

    goto :goto_0

    :cond_0
    invoke-interface {p1, v1, v0}, LZ/i;->v(ILjava/lang/String;)V

    :goto_0
    invoke-virtual {p2}, Lcom/tenjin/android/store/QueueEvent;->getDate()Ljava/util/Date;

    move-result-object v0

    invoke-static {v0}, Lcom/tenjin/android/store/TenjinRoomConverters;->dateToTimestamp(Ljava/util/Date;)Ljava/lang/Long;

    move-result-object v0

    const/4 v1, 0x3

    if-nez v0, :cond_1

    invoke-interface {p1, v1}, LZ/i;->A0(I)V

    goto :goto_1

    :cond_1
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    invoke-interface {p1, v1, v2, v3}, LZ/i;->b0(IJ)V

    :goto_1
    invoke-virtual {p2}, Lcom/tenjin/android/store/QueueEvent;->getEndpoint()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x4

    if-nez v0, :cond_2

    invoke-interface {p1, v1}, LZ/i;->A0(I)V

    goto :goto_2

    :cond_2
    invoke-virtual {p2}, Lcom/tenjin/android/store/QueueEvent;->getEndpoint()Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1, v1, p2}, LZ/i;->v(ILjava/lang/String;)V

    :goto_2
    return-void
.end method

.method public bridge synthetic bind(LZ/k;Ljava/lang/Object;)V
    .locals 0

    .line 2
    check-cast p2, Lcom/tenjin/android/store/QueueEvent;

    invoke-virtual {p0, p1, p2}, Lcom/tenjin/android/store/QueueEventDao_Impl$1;->bind(LZ/k;Lcom/tenjin/android/store/QueueEvent;)V

    return-void
.end method

.method public createQuery()Ljava/lang/String;
    .locals 1

    const-string v0, "INSERT OR ABORT INTO `QueueEvent` (`id`,`params`,`date`,`endpoint`) VALUES (nullif(?, 0),?,?,?)"

    return-object v0
.end method
