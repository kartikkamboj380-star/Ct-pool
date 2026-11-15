.class Lcom/tenjin/android/store/QueueEventDao_Impl$4;
.super Landroidx/room/A;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/tenjin/android/store/QueueEventDao_Impl;-><init>(Landroidx/room/u;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/tenjin/android/store/QueueEventDao_Impl;


# direct methods
.method constructor <init>(Lcom/tenjin/android/store/QueueEventDao_Impl;Landroidx/room/u;)V
    .locals 0

    iput-object p1, p0, Lcom/tenjin/android/store/QueueEventDao_Impl$4;->this$0:Lcom/tenjin/android/store/QueueEventDao_Impl;

    invoke-direct {p0, p2}, Landroidx/room/A;-><init>(Landroidx/room/u;)V

    return-void
.end method


# virtual methods
.method public createQuery()Ljava/lang/String;
    .locals 1

    const-string v0, "DELETE FROM QueueEvent WHERE date < ?"

    return-object v0
.end method
