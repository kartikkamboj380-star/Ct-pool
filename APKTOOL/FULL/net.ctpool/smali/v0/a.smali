.class public final synthetic Lv0/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:Lv0/i;

.field public final synthetic b:Ljava/lang/Boolean;


# direct methods
.method public synthetic constructor <init>(Lv0/i;Ljava/lang/Boolean;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv0/a;->a:Lv0/i;

    iput-object p2, p0, Lv0/a;->b:Ljava/lang/Boolean;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lv0/a;->a:Lv0/i;

    iget-object v1, p0, Lv0/a;->b:Ljava/lang/Boolean;

    invoke-static {v0, v1}, Lv0/i;->h(Lv0/i;Ljava/lang/Boolean;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
