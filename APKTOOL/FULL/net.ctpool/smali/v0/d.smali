.class public final synthetic Lv0/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic m:Lv0/i;

.field public final synthetic n:Ljava/util/List;


# direct methods
.method public synthetic constructor <init>(Lv0/i;Ljava/util/List;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv0/d;->m:Lv0/i;

    iput-object p2, p0, Lv0/d;->n:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lv0/d;->m:Lv0/i;

    iget-object v1, p0, Lv0/d;->n:Ljava/util/List;

    invoke-static {v0, v1}, Lv0/i;->g(Lv0/i;Ljava/util/List;)V

    return-void
.end method
