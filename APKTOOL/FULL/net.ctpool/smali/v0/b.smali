.class public final synthetic Lv0/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:Lv0/i;


# direct methods
.method public synthetic constructor <init>(Lv0/i;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv0/b;->a:Lv0/i;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lv0/b;->a:Lv0/i;

    invoke-static {v0}, Lv0/i;->b(Lv0/i;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
