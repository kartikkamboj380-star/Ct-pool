.class public final synthetic Lv0/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:Lv0/i;

.field public final synthetic b:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lv0/i;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv0/c;->a:Lv0/i;

    iput-object p2, p0, Lv0/c;->b:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lv0/c;->a:Lv0/i;

    iget-object v1, p0, Lv0/c;->b:Ljava/lang/String;

    invoke-static {v0, v1}, Lv0/i;->c(Lv0/i;Ljava/lang/String;)LS5/r;

    move-result-object v0

    return-object v0
.end method
